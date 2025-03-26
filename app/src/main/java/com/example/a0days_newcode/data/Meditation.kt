package com.example.a0days_newcode.data



// new part
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a0days_newcode.R



data class Meditation (
    val day: String,
    @StringRes val stringResourceId : Int,
    //@StringRes val DescriptiionResourceId : Int,
    @DrawableRes val imageResourceId : Int
)


val meditationList = listOf(
    Meditation(
        "Day 1",
        R.string.day_1_activity,
        //R.string.day_1_description,
        R.drawable.day_1
    ),
    Meditation(
        "Day 2",
        R.string.day_2_activity,
       // R.string.day_2_description,
        R.drawable.day_2
    ),
    Meditation(
        "Day 3",
        R.string.day_3_activity,
        //R.string.day_3_description,
        R.drawable.day_3
    ),
    Meditation(
        "Day 4",
        R.string.day_4_activity,
       // R.string.day_4_description,
        R.drawable.day_4
    ),
    Meditation(
        "Day 5",
        R.string.day_5_activity,
       // R.string.day_5_description,
        R.drawable.day_5
    ),
    Meditation(
        "Day 6",
        R.string.day_6_activity,
       // R.string.day_6_description,
        R.drawable.day_6
    ),
    Meditation(
        "Day 7",
        R.string.day_7_activity,
       // R.string.day_7_description,
        R.drawable.day_7
    ),
    Meditation(
        "Day 8",
        R.string.day_8_activity,
     //   R.string.day_8_description,
        R.drawable.day_8
    ),
    Meditation(
        "Day 9",
        R.string.day_9_activity,
     //   R.string.day_9_description,
        R.drawable.day_9
    ),
    Meditation(
        "Day 10",
        R.string.day_10_activity,
      //  R.string.day_10_description,
        R.drawable.day__10
    ),
    Meditation(
        "Day 11",
        R.string.day_11_activity,
      //  R.string.day_11_description,
        R.drawable.day_11
    ),
    Meditation(
        "Day 12",
        R.string.day_12_activity,
      //  R.string.day_12_description,
        R.drawable.day_12
    ),
    Meditation(
        "Day 13",
        R.string.day_13_activity,
       // R.string.day_13_description,
        R.drawable.day_13
    ),
    Meditation(
        "Day 14",
        R.string.day_14_activity,
      //  R.string.day_14_description,
        R.drawable.day_14
    ),
    Meditation(
        "Day 15",
        R.string.day_15_activity,
       // R.string.day_15_description,
        R.drawable.day_15
    ),
    Meditation(
        "Day 16",
        R.string.day_16_activity,
       // R.string.day_16_description,
        R.drawable.day_16
    ),
    Meditation(
        "Day 17",
        R.string.day_17_activity,
       // R.string.day_17_description,
        R.drawable.day_17
    ),
    Meditation(
        "Day 18",
        R.string.day_18_activity,
       // R.string.day_18_description,
        R.drawable.day_18
    ),
    Meditation(
        "Day 19",
        R.string.day_19_activity,
       // R.string.day_19_description,
        R.drawable.day_19
    ),
    Meditation(
        "Day 20",
        R.string.day_20_activity,
       // R.string.day_20_description,
        R.drawable.day_20
    ),
    Meditation(
        "Day 21",
        R.string.day_21_activity,
      //  R.string.day_21_description,
        R.drawable.day_21
    ),
    Meditation(
        "Day 22",
        R.string.day_22_activity,
      //  R.string.day_22_description,
        R.drawable.day_22
    ),
    Meditation(
        "Day 23",
        R.string.day_23_activity,
      //  R.string.day_23_description,
        R.drawable.day_23
    ),
    Meditation(
        "Day 24",
        R.string.day_24_activity,
     //   R.string.day_24_description,
        R.drawable.day_24
    ),
    Meditation(
        "Day 25",
        R.string.day_25_activity,
       // R.string.day_25_description,
        R.drawable.day_25
    ),
    Meditation(
        "Day 26",
        R.string.day_26_activity,
     //   R.string.day_26_description,
        R.drawable.day_26
    ),
    Meditation(
        "Day 27",
        R.string.day_27_activity,
     //   R.string.day_27_description,
        R.drawable.day_27
    ),
    Meditation(
        "Day 28",
        R.string.day_28_activity,
    //    R.string.day_28_description,
        R.drawable.day_28
    ),
    Meditation(
        "Day 29",
        R.string.day_29_activity,
     //   R.string.day_29_description,
        R.drawable.day_29
    ),
    Meditation(
        "Day 30",
        R.string.day_30_activity,
    //    R.string.day_30_description,
        R.drawable.day_30
    )
)