package com.ani.diary.goldendiary;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Set;


public class YourPreference {
    public static String MY_DATA_SHAREF_PREF = "Taakat_USER_DETAILS";
    private static YourPreference yourPreference;
    private SharedPreferences sharedPreferences;

    public static YourPreference getInstance(Context context) {
        if (yourPreference == null) {
            yourPreference = new YourPreference(context);
        }
        return yourPreference;
    }

    private YourPreference(Context context) {
        sharedPreferences = context.getSharedPreferences(MY_DATA_SHAREF_PREF, Context.MODE_PRIVATE);
    }

    public void saveDataString(String key, String value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putString(key, value);
        prefsEditor.commit();

    }
    public void saveDataSet(String key, Set value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putStringSet(key, value);
        prefsEditor.commit();
    }
    public void saveDataInt(String key, int value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor .putInt(key, value);
        prefsEditor.commit();
    }
    public void saveDataBoolean(String key, boolean value) {
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        prefsEditor.putBoolean(key, value);
        prefsEditor.commit();
    }

    public String getData(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getString(key, null);
        }
        return null;
    }
    public Boolean getBoolean(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getBoolean(key, false);
        }
        return false;
    }
    public Integer getDataInteger(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getInt(key, 0);
        }
        return 0;
    }
    public Set getDataSet(String key) {
        if (sharedPreferences!= null) {
            return sharedPreferences.getStringSet(key, null);
        }
        return null;
    }


    public  void clear()
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
//        editor.apply();
        editor.commit();
    }

}