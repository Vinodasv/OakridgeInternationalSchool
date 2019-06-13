
<?xml version="1.0" encoding="utf-8"?>

<RelativeLayout
    android:layout_height="wrap_content"
    android:layout_width="match_parent"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:layout_gravity="center"
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/t1">

    <com.synnapps.carouselview.CarouselView
        android:id="@+id/carouselView"
        android:layout_width="match_parent"
        android:background="#e62424"
        android:layout_height="200dp"
        app:fillColor="#FFFFFFFF"
        app:pageColor="#00000000"
        app:radius="6dp"
        app:slideInterval="3000"
        app:strokeColor="#FF777777"
        app:strokeWidth="1dp"/>


    <android.support.v7.widget.CardView
        android:layout_below="@+id/carouselView"

        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:card_view="http://schemas.android.com/apk/res-auto"
        android:id="@+id/cardview1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        card_view:cardElevation="7dp"
        card_view:contentPadding="7dp"
        card_view:cardCornerRadius="7dp"
        card_view:cardMaxElevation="7dp"

        >





        <ImageView
            android:id="@+id/profile_icon"
            android:layout_width="110dp"
            android:layout_height="59dp"
            android:layout_gravity="center"
            android:src="@drawable/profile_icon"

            android:padding="5dp"



            />

        <TextView
            android:id="@+id/tx"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity=""
            android:text="Home"
            android:textAppearance="@android:color/black"
            android:textColor="@android:color/black"
            />


    </android.support.v7.widget.CardView>

</RelativeLayout>