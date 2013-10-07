package com.cs3141.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JList;

import com.cs3141.calender.Event;
import com.cs3141.calender.EventManager;

public class delKeyListener implements KeyListener{

	private EventManager manager;
	private CalenderGui gui;
	private JList<Event> list;
	
	public delKeyListener(EventManager ma, CalenderGui gu, JList<Event> l){
		manager = ma;
		gui = gu;
		list = l;
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() ==''){
			manager.removeEvent(list.getSelectedValue());
			gui.remake();
		}
	}
}