package net.imglib3.type.try2;

public class DoubleType implements DoubleWritable, DoubleReadable< DoubleType >
{
	double d = 0.0;
	
	@Override
	public void set(DoubleReadable<?> r) { d = r.getDouble(); }

	@Override
	public DoubleType get() { return this; }

	@Override
	public double getDouble() { return d; }
}
