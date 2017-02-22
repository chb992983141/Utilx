package com.duff.steamplus.utilx;

public class TextUtilx {
	/**
	 * 获取文本的高度
	 * @param text
	 * @return
	 */
	private int getTextHeight(String text) {
		//获取文本的高度
		Rect bounds = new Rect();
		paint.getTextBounds(text,0,text.length(), bounds);
		return bounds.height();
	}
}
