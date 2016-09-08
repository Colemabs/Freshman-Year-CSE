import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.RandomAccessFile;


public class Ball extends Rectangle {

	private Color color;
	private int dx, dy, sw, sh;
	
	public Ball(int x, int y, int size, Color color, int dx, int dy, int sw, int sh){
		super(x, y, size, size);
		this.color = color;
		this.dx = dx;
		this.dy = dy;
		this.sw = sw;
		this.sh = sh;
	}
	
	public Ball(Ball b) {
		this(b.x, b.y, b.width, b.color, b.dx, b.dy, b.sw, b.sh);
	}
	
	public Ball(RandomAccessFile raf, int sw, int sh) throws Exception{
		load(raf, sw, sh);
	}
	
	////////////////////////////////methods
	public Ball clone(){
		return new Ball(this);
	}
	
	public void save(RandomAccessFile raf) throws Exception{
		raf.writeInt(x);
		raf.writeInt(y);
		raf.writeInt(width);
		raf.writeInt(dx);
		raf.writeInt(dy);
		raf.writeInt(color.getRGB());
	}
	
	public void load(RandomAccessFile raf, int sw, int sh) throws Exception{
		x = raf.readInt();
		y = raf.readInt();
		width = raf.readInt();
		dx = raf.readInt();
		dy = raf.readInt();
		color = new Color(raf.readInt());	
		this.sw = sw;
		this.sh = sh;
	}
	
	public void move(){
		x += dx;
		y += dy;
		
		if(x > sw)			      x = -width;
		else if( x + width < 0)   x = sw;
		
		if(y > sh)			      y = -height;
		else if( y + height < 0)  y = sh;
		
	}
	
	public void draw(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, width, height);
		
		g.setColor(Color.BLACK);
		g.fillOval(x, y, width, height);
	}
}
