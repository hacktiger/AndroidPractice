<?xml version="1.0" encoding="utf-8"?>

<TableLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    xmlns:android="http://schemas.android.com/apk/res/android">

    <TableRow>
        <!-- Dong 2 co 2 cot => layout_span=2 => dai = dong2 -->
        <TextView
            android:gravity="center"
            android:background="#ff2"
            android:layout_span="10"
            android:textSize="21sp"
            android:text ="Dong Cot" />
    </TableRow>

    <TableRow>
        <TextView
            android:textSize="21sp"
            android:text="Dong 2"/>
        <TextView
            android:textSize="21sp"
            android:text="Dong 2"/>
    </TableRow>

    <TableRow>
        <TextView
            android:textSize="21sp"
            android:text="Dong 3"/>
        <TextView
            android:textSize="21sp"
            android:text="Dong 2"/>
        <TextView
            android:textSize="21sp"
            android:text="Dong 2"/>
        <TextView
            android:textSize="21sp"
            android:text="Dong 2"/>
    </TableRow>

</TableLayout>