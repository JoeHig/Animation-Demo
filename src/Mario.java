

import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class Mario extends MovingImage {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;
	private int vX,vY;
	public Mario(int x, int y) {
		super("mario.png", x, y, MARIO_WIDTH, MARIO_HEIGHT);
		vX=0;
		vY=0;
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) {
		vY+=6;
		system.out.println("kjjdafsaw  fsaf asfd gh");
		super.y+=vY;
	}


}
