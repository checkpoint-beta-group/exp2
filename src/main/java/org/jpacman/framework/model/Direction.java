package org.jpacman.framework.model;

/**
 * Directions in which sprites can move.
 * 
 * @author Arie van Deursen, TU Delft, Jan 23, 2012
 */
public enum Direction {
	
	UP(0, -1), 
	DOWN(0, 1),
	LEFT(-1, 0),
	RIGHT(1, 0);
	
	private int dx, dy;
	
	/**
	 * Create a new direction.
	 * @param newDx horizontal move
	 * @param newDy vertical move
	 */
	Direction(int newDx, int newDy) {
		this.dx = newDx;
		this.dy = newDy;
	}
	
	/**
	 * @return Number of cells to move in horizontal direction
	 */
	public int getDx() {
		return dx;
	}
	
	/**
	 * @return Number of cells to move in vertical direction.
	 */
	public int getDy() {
		return dy;
	}
}
