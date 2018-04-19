package com.raywenderlich.android.creatures.ui

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper

/**
 * Created by isabellee on 4/10/18.
 */
class GridItemTouchHelperCallback(private val listener: ItemTouchHelpListener) : ItemTouchHelper.Callback() {

	override fun isLongPressDragEnabled(): Boolean = true

	override fun getMovementFlags(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?): Int {
		return makeMovementFlags(ItemTouchHelper.UP or ItemTouchHelper.DOWN or ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT, 0)
	}

	override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, target: RecyclerView.ViewHolder): Boolean {
		return listener.onItemMove(recyclerView, viewHolder.adapterPosition, target.adapterPosition)
	}

	override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int) {
		TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
	}
}