package com.test.question.q100;

class Packer {

	static int pencilCount;
	static int eraserCount;
	static int ballPointPenCount;
	static int rulerCount;
	
	void packing(Pencil pencil) { //4B, 3B, 2B, B, HB, H, 2H, 3H, 4H
		if (pencil.getHardness().equals("4B") || pencil.getHardness().equals("3B") ||
			pencil.getHardness().equals("2B") || pencil.getHardness().equals("B") ||
			pencil.getHardness().equals("HB") || pencil.getHardness().equals("H") ||
			pencil.getHardness().equals("2H") || pencil.getHardness().equals("3H") ||
			pencil.getHardness().equals("4H")) {
			pencilCount++;
			System.out.printf("포장 전 검수 : %s 진하기 연필입니다.\n"
					, pencil.getHardness());
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패했습니다.");
			return;
		}
	}
	void packing(Eraser eraser) { //지우개 크기(Large, Medium, Small)
		if (eraser.getSize().equals("Large") || eraser.getSize().equals("Medium") ||
			eraser.getSize().equals("Small")) {
			eraserCount++;
			System.out.printf("포장 전 검수 : %s 사이즈 지우개입니다.\n"
					, eraser.getSize());
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패했습니다.");
			return;
		}
	}
	void packing(BallPointPen ballPointPen) { //볼펜 심 두께(0.3mm, 0.5mm, 0.7mm, 1mm, 1.5mm) 볼펜 색상(red, blue, green, black)
		if (ballPointPen.getThickness() == 0.3 || ballPointPen.getThickness() == 0.5 ||
			ballPointPen.getThickness() == 0.7 || ballPointPen.getThickness() == 1 ||
			ballPointPen.getThickness() == 1.5 ||
			ballPointPen.getColor().equals("green") || ballPointPen.getColor().equals("blue") ||
			ballPointPen.getColor().equals("black") || ballPointPen.getColor().equals("red")) {
			ballPointPenCount++;
			System.out.printf("포장 전 검수 : %s 색상 %.1fmm 볼펜입니다.\n"
					, ballPointPen.getColor()
					, ballPointPen.getThickness());
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패했습니다.");
			return;
		}
	}
	void packing(Ruler ruler) { //자 길이(30cm, 50cm, 100cm) 자 형태(줄자, 운형자, 삼각자)
		if (ruler.getLength() == 30 || ruler.getLength() == 50 || ruler.getLength() == 100 ||
			ruler.getShape().equals("줄자") || ruler.getShape().equals("운형자") || ruler.getShape().equals("삼각자")) {
			rulerCount++;
			System.out.printf("포장 전 검수 : %dcm %s입니다.\n"
					, ruler.getLength()
					, ruler.getShape());
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패했습니다.");
			return;
		}
	}
	void countPacking(int type) {
		System.out.println();
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		if (type == 0) {
			System.out.printf("연필 %d회\n", pencilCount);
			System.out.printf("지우개 %d회\n", eraserCount);
			System.out.printf("볼펜 %d회\n", ballPointPenCount);
			System.out.printf("자 %d회\n", rulerCount);
		} else if (type == 1) {
			System.out.printf("연필 %d회\n", pencilCount);
		} else if (type == 2) {
			System.out.printf("지우개 %d회\n", eraserCount);
		} else if (type == 3) {
			System.out.printf("볼펜 %d회\n", ballPointPenCount);
		} else {
			System.out.printf("자 %d회\n", rulerCount);
		}
	}
	
}
