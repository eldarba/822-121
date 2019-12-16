package e.finalKeyword;

import lines.Line;

// a final class cannot be extended
public final class FinalLine extends Line {

	public FinalLine(int length) {
		super(length);
	}

	@Override
	public void draw() {
		super.draw();
		System.out.println("================================");
	}
	
	
	
	

}
