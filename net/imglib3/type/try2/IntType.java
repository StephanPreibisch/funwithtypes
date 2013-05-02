package net.imglib3.type.try2;

public class IntType implements IntSet, IntRead< IntType >
{
	int i = 0;
	
	@Override
	public IntType get() { return this; }

	@Override
	public void set(IntRead<?> r) { this.i = r.getInt(); }

	@Override
	public int getInt() { return i; }
}
