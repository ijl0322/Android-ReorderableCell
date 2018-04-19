package com.raywenderlich.android.creatures.ui

import android.support.v7.widget.RecyclerView

/**
 * Created by isabellee on 4/13/18.
 */
interface ItemDragListener {
	fun onItemDrag(viewHolder: RecyclerView.ViewHolder)
}