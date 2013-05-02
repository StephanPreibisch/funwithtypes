package net.imglib3.type.try1;

public class IntType implements IntReadable< IntType >, IntWritable< IntType >
{
	int i = 0;

	@Override
	public double getDouble() { return i; }

	@Override
	public int getInt() { return i; }

	@Override
	public void set(byte b) { this.i = b; }

	@Override
	public void set(int i) { this.i = i; }

	@Override
	public void set(IntType w) { this.i = w.i; }

	//@Override
	//public void get(IntType r) { r.i = this.i; }

}
