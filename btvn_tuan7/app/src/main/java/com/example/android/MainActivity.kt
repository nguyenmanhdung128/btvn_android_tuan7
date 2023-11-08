package com.example.android

import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var list: ArrayList<GroupApp> = ArrayList<GroupApp>()

        var listApp: ArrayList<App> = ArrayList<App>()
        listApp.add(App("game1", R.drawable._11, 4.7))
        listApp.add(App("game2", R.drawable._12, 4.6))
        listApp.add(App("game3", R.drawable._13, 4.0))
        listApp.add(App("game4", R.drawable._14, 4.1))
        listApp.add(App("game5", R.drawable._15, 4.8))
        list.add(GroupApp("Top games", listApp))

        var listApp1: ArrayList<App> = ArrayList<App>()
        listApp1.add(App("App1", R.drawable._31, 4.7))
        listApp1.add(App("App2", R.drawable._32, 4.6))
        listApp1.add(App("App3", R.drawable._33, 4.0))
        listApp1.add(App("App4", R.drawable._34, 4.1))
        listApp1.add(App("App5", R.drawable._35, 4.8))
        list.add(GroupApp("Top applicantion", listApp1))

        var listApp2: ArrayList<App> = ArrayList<App>()
        listApp2.add(App("Rise", R.drawable._15, 4.7))
        listApp2.add(App("Pete", R.drawable._14, 4.6))
        listApp2.add(App("Survivors", R.drawable._13, 4.0))
        listApp2.add(App("Bad 2 Bad", R.drawable._12, 4.1))
        listApp2.add(App("Chiki's", R.drawable._11, 4.8))
        list.add(GroupApp("Happy games ", listApp2))

        var listApp3: ArrayList<App> = ArrayList<App>()
        listApp3.add(App("Drakrise", R.drawable._35, 4.7))
        listApp3.add(App("Pickle Pete", R.drawable._34, 4.6))
        listApp3.add(App("Vampire Survivors", R.drawable._33, 4.0))
        listApp3.add(App("Bad 2 Bad", R.drawable._32, 4.1))
        listApp3.add(App("Chiki's Chase", R.drawable._31, 4.8))
        list.add(GroupApp("Scary games", listApp3 ))

        val customAdapter: GroupAdapater = GroupAdapater(list, this)

        val listView = findViewById<RecyclerView>(R.id.recyclerViewGroup)
        listView.adapter = customAdapter
        listView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

    }

}

