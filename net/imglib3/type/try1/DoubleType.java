package net.imglib3.type.try1;

public class DoubleType implements DoubleReadable< DoubleType >, DoubleWritable< DoubleType >
{
	double d;

	@Override
	public void set(int i) { this.d = i; }

	@Override
	public void set(byte b) { this.d = b; }

	@Override
	public void set(double d) { this.d = d; }

	@Override
	public double getDouble() { return d; }

	@Override
	public void set(DoubleType w) { this.d = w.d; }

	//@Override
	//public void get(DoubleType r) { r.d = d; }
}
