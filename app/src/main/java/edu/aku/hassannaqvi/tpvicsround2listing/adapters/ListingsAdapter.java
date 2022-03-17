package edu.aku.hassannaqvi.tpvicsround2listing.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Collections;
import java.util.List;

import edu.aku.hassannaqvi.tpvicsround2listing.R;
import edu.aku.hassannaqvi.tpvicsround2listing.database.DatabaseHelper;
import edu.aku.hassannaqvi.tpvicsround2listing.models.Form;

/**
 * Created by hassan.naqvi on 8/1/2016.
 */
public class ListingsAdapter extends RecyclerView.Adapter<ListingsAdapter.ViewHolder> {
    private static final String TAG = "ListingsAdapter";
    Context c;
    DatabaseHelper db;
    private List<Form> fc = Collections.emptyList();

    // Provide a suitable constructor (depends on the kind of dataset)
    public ListingsAdapter(List<Form> fc, Context c) {
        this.fc = fc;
        this.c = c;
//        Log.d("TAG:count", String.valueOf(getItemCount()));
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.household_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        db = new DatabaseHelper(c);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element

/*        int childCount = 0;
        childCount = db.getChildrenByUUID(fc.get(position).get_UID());
        int photoChild = 0;
        photoChild = db.getChildrenPhotoCheck(fc.get(position).get_UID());
        int cardChild = 0;
        cardChild = db.getChildrenCardCheck(fc.get(position).get_UID());

        int anthroStatus = 0;
        anthroStatus = db.checkAnthro(fc.get(position).getUid());

        int bloodStatus = 0;
        bloodStatus = db.checkBlood(fc.get(position).getUid());

        int stoolStatus = 0;
        stoolStatus = db.checkStool(fc.get(position).getUid());

        String motherName = "";
        try {
            motherName = db.getWraName(fc.get(position).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(Form): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        String childName = "";
        try {
            childName = db.getChildName(fc.get(position).getUid());
        } catch (JSONException e) {
            e.printStackTrace();
            Toast.makeText(c, "JSONException(Form): " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }*/

      /*   String iStatus = "Status  Unknown";
        int iColor = 0;
       switch (fc.get(position).getiStatus()) {
            case "1":
                iStatus = "Complete";
                iColor = Color.GREEN;
                break;
            case "2":
                iStatus = "No Respondent";
                iColor = Color.RED;
                break;
            case "3":
                iStatus = "Memebers Absent";
                iColor = Color.RED;
                break;
            case "4":
                iStatus = "Refused";
                iColor = Color.RED;
                break;
            case "5":
                iStatus = "Empty";
                iColor = Color.RED;
                break;
            case "6":
                iStatus = "Not Found";
                iColor = Color.RED;
                break;
            case "96":
                iStatus = "Other Reason";
                iColor = Color.RED;
                break;
            default:
                iStatus = "Open Form";
                iColor = Color.RED;
                break;

        }*/

        holder.hhno.setText(fc.get(position).getHh20() + "-" + fc.get(position).getHh20());
        holder.psuCode.setText(fc.get(position).getHh01());
        holder.istatus.setText(fc.get(position).getHh10());
        holder.headName.setText(fc.get(position).getHh11());
        holder.mwraCount.setText(fc.get(position).getHh15().equals("") ? "MWRA: " + fc.get(position).getHh15() : "");
        holder.familyCount.setImageResource(fc.get(position).getHh07().equals("1") ? R.drawable.ic_residential : R.drawable.ic_non_residential);

       /* holder.secStatusBlood.setText(bloodStatus == 2 ? "  Done   " : " Pending ");
        holder.secStatusStool.setText(stoolStatus == 2 ? "  Done   " : " Pending ");
        holder.mwraCount.setTextColor(anthroStatus == 2 ? Color.GREEN : Color.RED);
        holder.secStatusBlood.setTextColor(bloodStatus == 2 ? Color.GREEN : Color.RED);
        holder.secStatusStool.setTextColor(stoolStatus == 2 ? Color.GREEN : Color.RED);*/

        holder.sysdate.setText(fc.get(position).getSysDate());
        //holder.istatus.setTextColor(iColor);


      /*  holder.itemView.setOnClickListener(v -> {
            // Get the current state of the item

            MainApp.form = fc.get(position);
            //MainApp.households.setVisitNo(String.valueOf(Integer.parseInt(MainApp.households.getVisitNo())+1));
            if (!MainApp.form.getiStatus().equals("1")) {

                editHousehold(position);

            } else {
                Toast.makeText(c, "This households has been locked. You cannot edit household for locked households", Toast.LENGTH_LONG).show();
            }


        });
*/
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return fc.size();
    }

/*    private void editHousehold(int position) {
        MainApp.form = new Form();
        try {
            List<Form> = db.getListingsByCluster(fc.get(position).getHh01());
        } catch (JSONException e) {
            Log.d(TAG, c.getString(R.string.hh_exists_form) + e.getMessage());
            Toast.makeText(c, c.getString(R.string.hh_exists_form) + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }*/

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public RecyclerView rv;
        public TextView sysdate;
        public TextView psuCode;
        public TextView hhno;
        public TextView istatus;
        public TextView mwraCount;
        public ImageView familyCount;
        public TextView secStatusBlood;
        public TextView secStatusStool;
        public TextView headName;
        // each data item is just a string in this case

        public ViewHolder(View v) {
            super(v);
//            rv = v.findViewById(R.id.FormsList);
            sysdate = v.findViewById(R.id.sysdate);
            psuCode = v.findViewById(R.id.psuCode);
            hhno = v.findViewById(R.id.hhno);
            istatus = v.findViewById(R.id.istatus);
            headName = v.findViewById(R.id.headname);
            mwraCount = v.findViewById(R.id.mwraCount);
            familyCount = v.findViewById(R.id.familyCount);

        }


    }
}