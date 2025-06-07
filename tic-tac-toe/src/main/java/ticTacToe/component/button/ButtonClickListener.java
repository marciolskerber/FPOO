package ticTacToe.component.button;

import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

import ticTacToe.component.button.ButtonClickEvent.MouseButton;

public interface ButtonClickListener {
	
	Set<ButtonClickListener> buttonClickListeners = new HashSet<>();

	public void addButtonClickListener(ButtonClickListener listener) {
	    buttonClickListeners.add(listener);
	}

	public void removeButtonClickListener(ButtonClickListener listener) {
	    buttonClickListeners.remove(listener);
	}

	private void dispatchButtonClickEvent(MouseEvent me) {
	    MouseButton button = ((me.getButton() == MouseEvent.BUTTON1) ? MouseEvent.BUTTON.LEFT :
	                         (me.getButton() == MouseEvent.BUTTON2) ? MouseEvent.BUTTON.MIDLE :
	                         MouseButton.RIGHT );

	    ButtonClickEvent event = new ButtonClickEvent(this, button);
	    buttonClickListeners.forEach(listener->listener.onClick(event));
	}