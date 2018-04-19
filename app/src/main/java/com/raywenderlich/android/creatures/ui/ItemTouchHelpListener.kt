package com.raywenderlich.android.creatures.ui

import android.support.v7.widget.RecyclerView

/**
 * Created by isabellee on 4/10/18.
 */
interface ItemTouchHelpListener {
	fun onItemMove(recyclerView: RecyclerView, fromPosition: Int, toPosition: Int) : Boolean
	fun onItemDismiss(viewHolder: RecyclerView.ViewHolder, position: Int)
}