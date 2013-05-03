package net.imglib3.type.try4;

public class DoubleType implements DoubleWritable, DoubleReadable
{
	double d = 0.0;
	
	@Override
	public void set(DoubleReadable r) { d = r.getDouble(); }

	@Override
	public double getDouble() { return d; }
}
