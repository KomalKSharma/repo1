package repo1;

public class Inheritance {

	public static void main(String[] args) {
		BarclaysBank barclaysObj = new BarclaysBank();
		barclaysObj.interestRate6();
	}
}

class Bank{
	public double interestRate() {
		return 1.2d;
	}

}
class IndianBank extends Bank{
	public double interestRate1() {
		return 1.2d;
	}
}

class ForeignBank extends Bank{
	public double interestRate2() {
		return 1.2d;
	}
}

class HdfcBank extends IndianBank{
	public double interestRate3() {
		return 1.2d;
	}
}

class IciciBank extends IndianBank{
	public double interestRate4() {
		return 1.2d;
	}
}

class CitiBank1 extends ForeignBank{
	public double interestRate5() {
		return 1.2d;
	}
}

class BarclaysBank extends ForeignBank{
	public double interestRate6() {
		return 1.2d;
	}
}
