package de.markusressel.typedpreferences;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;

import lombok.Getter;

/**
 * Created by Markus on 16.07.2017.
 */
@Getter
public class PreferenceItem<T> {

    @StringRes
    private final int keyRes;
    private final T defaultValue;

    public PreferenceItem(@StringRes int keyRes, @NonNull T defaultValue) {
        if (defaultValue == null) {
            throw new IllegalArgumentException("default value must not be null!");
        }

        this.keyRes = keyRes;
        this.defaultValue = defaultValue;
    }

    /**
     * Get the key of this preference as string
     *
     * @param context application context
     * @return Preference key
     */
    public String getKey(Context context) {
        return context.getString(keyRes);
    }

}
