package net.imglib3.type.try4;

public class IntType implements IntWritable, IntReadable
{
	int i = 0;
	
	@Override
	public void set(IntReadable r) { this.i = r.getInt(); }

	@Override
	public int getInt() { return i; }

	@Override
	public double getDouble() { return i; }
}
