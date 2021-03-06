package es.urjc.jer.game;

public class Player {

	private long id;
	private int x, y, velocityX;
	private int score;
	private int skin;
	private boolean rightDown = false; 
	private boolean leftDown = false;
	private boolean joined = false;
	private boolean spaceDown = false;
	private boolean isWinner = false;
	
	
	Player() {
		this.score = 0;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public long getSkin() {
		return skin;
	}

	public void setSkin(int skin) {
		this.skin = skin;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getVelocityX() {
		return velocityX;
	}

	public void setVelocityX(int x) {
		this.velocityX = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void setRight(boolean b) {
		rightDown = b;
	}
	
	public boolean getRight() {
		return rightDown;
	}
	
	public void setLeft(boolean b) {
		leftDown = b;
	}
	
	public boolean getLeft() {
		return leftDown;
	}
	
	public boolean getJoined() {
		return joined;
	}
	
	public void setJoined(boolean j) {
		joined = j;
	}
	
	public boolean getSpace() {
		return spaceDown;
	}
	
	public void setSpace(boolean s) {
		spaceDown = s;
	}
	
	public boolean getWinner() {
		return isWinner;
	}
	
	public void setWinner(boolean w) {
		isWinner = w;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", x=" + x + ", y=" + y + ", score=" + score + ", rightPulsado=" + rightDown + ", leftDown="+ leftDown +", joined=" + joined + ", spaceDown=" + spaceDown + ", isWinner=" + isWinner + "  ]";
	}

}