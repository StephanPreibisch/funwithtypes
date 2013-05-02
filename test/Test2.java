package test;

import net.imglib3.type.try2.ByteReadable;
import net.imglib3.type.try2.ByteWritable;
import net.imglib3.type.try2.ByteType;
import net.imglib3.type.try2.IntReadable;
import net.imglib3.type.try2.IntWritable;
import net.imglib3.type.try2.IntType;
import net.imglib3.type.try2.Readable;
import net.imglib3.type.try2.Writable;


public class Test2 
{
	public static void main( String[] args )
	{
		//test( new IntType(), new IntType() );
		//new IntType().set( new ByteType() );

		ByteType b = new ByteType();
		IntType i = new IntType();
		
		i.set( i );
		i.set( b );
		
		Readable< IntType > i2 = i;
		Writable< IntReadable< ? > > i3 = i;
		
		test( i, i );
		
		/*
		IntSet i = null;
		ByteSet b = null;
		
		IntRead< ? > ir = null;
		ByteRead< ? > br = null;
		
		b.set( br );
		i.set( ir );
		i.set( br ); */
	}
	
	public static < T extends Readable< T > & Writable< T > > void test( final T t1, final T t2)
	{
		t2.set( t1 );
	}
	
}
