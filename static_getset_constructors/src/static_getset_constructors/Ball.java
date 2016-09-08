package static_getset_constructors;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private static int sw , sh;
	private int x, y, size, dx, dy;
	private Color color;
	private boolean isMoving;
	
	//===================================================================Constructors
	//we create 3 methods called constructors
	public Ball(){
		this(0, 0, 0);
	}
	
	public Ball(int x, int y, int size){//This is the minimum amount of characteristics a ball can have
		this(x, y, size, 1, 1, Color.BLACK, false);
	}
	
	@Override
	public String toString() {
		return "Ball [x=" + x + ", y=" + y + ", size=" + size + ", dx=" + dx
				+ ", dy=" + dy + ", color=" + color + ", isMoving=" + isMoving
				+ "]";
	}

	public Ball(int x, int y, int size, int dx, int dy, Color color, boolean isMoving){
		//"pay homage to the parent: java.lang.Object"
		super();// calls parent
		setX(x);
		setY(y);
		setSize(size);
		setDx(dx);
		setDy(dy);
		setColor(color);
		setMoving(isMoving);
	}
	
	
	//===================================================================Methods
	public void move(){

	if(!isMoving)return;
	x += dx;
	y += dy;
	
	if(x + size > getSw()){
		x = getSw() - size;
		dx = -dx;
	}
	
	if(y + size > getSh()){
		y = getSh() - size;
		dy = -dy;
	}
	
	if(x < 0){
		x = 0;
		dx = -dx;
	}
	
	if(y < 0){
		y = 0;
		dy = -dy;
	}
	}
	
	public void draw(Graphics g){
		
	}
	
	//============================================================================ Getters/Setters
	public void setSize(int size){
		if(size < 5)
			this.size = 5;//the word "this" refers to this particular class-"Ball"
		else if(size > 20)
			this.size = 20;
		else
			this.size = size;
	}
	public int getSize(){
		return this.size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public int getSw() {
		return sw;
	}

	public static void setSw(int sw) {
		Ball.sw = sw;
	}

	public int getSh() {
		return sh;
	}

	public static void setSh(int sh) {
		Ball.sh = sh;
	}
}

