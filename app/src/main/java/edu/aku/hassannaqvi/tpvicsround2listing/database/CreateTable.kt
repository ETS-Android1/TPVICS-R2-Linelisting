package edu.aku.hassannaqvi.tpvicsround2listing.database

import edu.aku.hassannaqvi.tpvicsround2listing.contracts.TableContracts.*
import edu.aku.hassannaqvi.tpvicsround2listing.core.MainApp.PROJECT_NAME

object CreateTable {

    const val DATABASE_NAME = "$PROJECT_NAME.db"
    const val DATABASE_COPY = "${PROJECT_NAME}_copy.db"
    const val DATABASE_VERSION = 1

    const val SQL_CREATE_FORM = ("CREATE TABLE "
            + FormTable.TABLE_NAME + "("
            + FormTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + FormTable.COLUMN_PROJECT_NAME + " TEXT,"
            + FormTable.COLUMN_UID + " TEXT,"
            + FormTable.COLUMN_USERNAME + " TEXT,"
            + FormTable.COLUMN_CLUSTER + " TEXT,"
            + FormTable.COLUMN_SYSDATE + " TEXT,"
            + FormTable.COLUMN_START_TIME + " TEXT,"
            + FormTable.COLUMN_END_TIME + " TEXT,"
            + FormTable.COLUMN_ISTATUS + " TEXT,"
            + FormTable.COLUMN_DEVICEID + " TEXT,"
            + FormTable.COLUMN_DEVICETAGID + " TEXT,"
            + FormTable.COLUMN_SYNCED + " TEXT,"
            + FormTable.COLUMN_SYNCED_DATE + " TEXT,"
            + FormTable.COLUMN_APPVERSION + " TEXT,"
            + FormTable.COLUMN_SA + " TEXT,"
            + FormTable.COLUMN_SB + " TEXT,"
            + FormTable.COLUMN_LC + " TEXT"
            + " );"
            )

    const val SQL_CREATE_MWRA = ("CREATE TABLE "
            + MwraTable.TABLE_NAME + "("
            + MwraTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + MwraTable.COLUMN_PROJECT_NAME + " TEXT,"
            + MwraTable.COLUMN_UID + " TEXT,"
            + MwraTable.COLUMN_UUID + " TEXT,"
            + MwraTable.COLUMN_USERNAME + " TEXT,"
            + MwraTable.COLUMN_SYSDATE + " TEXT,"
            + MwraTable.COLUMN_START_TIME + " TEXT,"
            + MwraTable.COLUMN_END_TIME + " TEXT,"
            + MwraTable.COLUMN_ISTATUS + " TEXT,"
            + MwraTable.COLUMN_DEVICEID + " TEXT,"
            + MwraTable.COLUMN_DEVICETAGID + " TEXT,"
            + MwraTable.COLUMN_SYNCED + " TEXT,"
            + MwraTable.COLUMN_SYNCED_DATE + " TEXT,"
            + MwraTable.COLUMN_APPVERSION + " TEXT,"
            + MwraTable.COLUMN_SMWRA + " TEXT"

            + " );"
            )

    const val SQL_CREATE_USERS = ("CREATE TABLE "
            + UsersTable.TABLE_NAME + "("
            + UsersTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + UsersTable.COLUMN_USERNAME + " TEXT,"
            + UsersTable.COLUMN_PASSWORD + " TEXT,"
            + UsersTable.COLUMN_FULLNAME + " TEXT,"
            + UsersTable.COLUMN_DIST_ID + " TEXT,"
            + UsersTable.COLUMN_ENABLED + " TEXT,"
            + UsersTable.COLUMN_ISNEW_USER + " TEXT,"
            + UsersTable.COLUMN_PWD_EXPIRY + " TEXT,"
            + UsersTable.COLUMN_DESIGNATION + " TEXT"
            + " );"
            )


    const val SQL_CREATE_VERSIONAPP = ("CREATE TABLE "
            + VersionTable.TABLE_NAME + " ("
            + VersionTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + VersionTable.COLUMN_VERSION_CODE + " TEXT, "
            + VersionTable.COLUMN_VERSION_NAME + " TEXT, "
            + VersionTable.COLUMN_PATH_NAME + " TEXT "
            + ");"
            )

    const val SQL_CREATE_CLUSTERS = ("CREATE TABLE "
            + ClusterTable.TABLE_NAME + "("
            + ClusterTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + ClusterTable.COLUMN_GEOAREA + " TEXT,"
            + ClusterTable.COLUMN_DIST_ID + " TEXT,"
            + ClusterTable.COLUMN_EB_CODE + " TEXT"
            + " );"
            )

    const val SQL_CREATE_ENTRYLOGS = ("CREATE TABLE "
            + EntryLogTable.TABLE_NAME + "("
            + EntryLogTable.COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + EntryLogTable.COLUMN_PROJECT_NAME + " TEXT,"
            + EntryLogTable.COLUMN_UID + " TEXT,"
            + EntryLogTable.COLUMN_UUID + " TEXT,"
            + EntryLogTable.COLUMN_PSU_CODE + " TEXT,"
            + EntryLogTable.COLUMN_HHID + " TEXT,"
            + EntryLogTable.COLUMN_USERNAME + " TEXT,"
            + EntryLogTable.COLUMN_SYSDATE + " TEXT,"
            + EntryLogTable.COLUMN_DEVICEID + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_DATE + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS + " TEXT,"
            + EntryLogTable.COLUMN_ISTATUS96x + " TEXT,"
            + EntryLogTable.COLUMN_ENTRY_TYPE + " TEXT,"
            + EntryLogTable.COLUMN_SYNCED + " TEXT,"
            + EntryLogTable.COLUMN_SYNC_DATE + " TEXT,"
            + EntryLogTable.COLUMN_APPVERSION + " TEXT"
            + " );"
            )
}