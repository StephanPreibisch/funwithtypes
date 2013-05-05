package net.imglib3.type.try4;


public interface Writable< S extends Readable< ? > >
{
	void set( S r );
}
