package p1;

public class Test {

	public static void main(String[] args) {

		MyGenerics<Integer> papa = new MyGenerics<>();
		papa.helloPapakiPari(5);
		
		MyGenerics<String> mummy = new MyGenerics<>();
		mummy.helloPapakiPari("Hello");
		
		MyGenerics<Boolean> sister = new MyGenerics<>();
		sister.helloPapakiPari(false);
		
		MyGenerics<Car> bother = new MyGenerics<>();
		bother.helloPapakiPari(new Car());

	}

}
