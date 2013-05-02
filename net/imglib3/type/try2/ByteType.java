package net.imglib3.type.try2;

public class ByteType implements ByteWritable, ByteReadable< ByteType >
{
	byte b  = 0;
	
	@Override
	public ByteType get() { return this; }

	@Override
	public void set(ByteReadable<?> r) { this.b = r.getByte(); }

	@Override
	public double getDouble() { return b; }

	@Override
	public int getInt() { return b; }

	@Override
	public byte getByte() { return b; }
}
