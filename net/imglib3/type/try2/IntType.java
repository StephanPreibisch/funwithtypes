package net.imglib3.type.try2;

public class IntType implements IntWritable, IntReadable< IntType >
{
	int i = 0;
	
	@Override
	public IntType get() { return this; }

	@Override
	public void set(IntReadable<?> r) { this.i = r.getInt(); }

	@Override
	public int getInt() { return i; }

	@Override
	public double getDouble() { return i; }
}
