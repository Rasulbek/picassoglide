package uz.tafakkur.picassoglide;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefUtil {

    private static final String STORAGE = "uz.tafakkur.picassoglide.STORAGE";
    private static final String LAST_IMAGE_URL = "LAST_IMAGE_URL";

    public PrefUtil() {
    }

    private static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);
    }

    public static void storeLastImageUrl(Context context, String imageUrl) {
        SharedPreferences.Editor editor = getSharedPreferences(context).edit();
        editor.putString(LAST_IMAGE_URL, imageUrl);
        editor.apply();
    }

    public static String getLastImageUrl(Context context) {
        return getSharedPreferences(context).getString(LAST_IMAGE_URL, "https://theimageconference.org/wp-content/uploads/2020/04/vancouver_image_conference_3-scaled.jpg");
    }
}
