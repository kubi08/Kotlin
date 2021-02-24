package com.kubilay.kotlinlearning

object Constants {

   const val dataBaseName="DirectoryDB"
   const val databaseVersion=1
   const val dataBaseTable="DirectoryTB"
   const val id="Id"
   const val firstName="Kubi"
   const val lastName="Besli"
   const val phone="Phone"
   const val image="Image"
   const val addedTimeStamp = "AddedTimeStamp"
   const val upgradesTimesStamp = "UpgradesTimesStamp"

   const val CREATE_TABLE = (
            "CREATE TABLE " + dataBaseTable + "("
                    + id + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + firstName + " TEXT,"
                    + lastName + " TEXT,"
                    + phone + " TEXT,"
                    + image + " TEXT,"
                    + addedTimeStamp + " TEXT,"
                    + upgradesTimesStamp + " TEXT"
                    + ")"
            )

}