package net.imglib3.type.try1;

public interface ByteWritable< R extends ByteReadable > extends Writable< R >
{
	void set( byte b );
}
