package com.example.datavisualizationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.mikephil.charting.charts.BarChart
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val barChart = findViewById<BarChart>(R.id.barChart)

        val entries = ArrayList<BarEntry>()
        entries.add(BarEntry(1f, 10f))
        entries.add(BarEntry(2f, 20f))
        entries.add(BarEntry(3f, 15f))
        entries.add(BarEntry(4f, 30f))
        entries.add(BarEntry(5f, 25f))

        val dataSet = BarDataSet(entries, "Student Marks")
        val barData = BarData(dataSet)

        barChart.data = barData
        barChart.invalidate()
    }
}