package test;

import net.imglib3.type.try4.IntWritable;
import net.imglib3.type.try4.Writable;
import net.imglib3.type.try4.ByteType;
import net.imglib3.type.try4.DoubleType;
import net.imglib3.type.try4.IntType;
import net.imglib3.type.try4.Readable;

/**
 * Test for net.imglib3.type.try4
 * 
 * @author preibischs
 *
 */
public class Test4 
{
	public static void main( String[] args )
	{
		ByteType b = new ByteType();
		IntType i = new IntType();
		DoubleType d = new DoubleType();
		
		b.set( b );
		
		i.set( i );
		i.set( b );
		
		d.set( i );
		d.set( b );
		d.set( d );
		
		test1( i, i );
		
		test2( i, b );
		test2( i, i );
		test2( i, d ); // fail
		test2( i, new Object() ); // fail
	}
	
	public static < T extends Writable< ? super T > > void test1( T t1, T t2 )
	{
		t1.set( t2 );
	}
	
	public static < S,  T extends Writable< ? super S > > void test2( T t1, S t2 )
	{
		t1.set( t2 );
	}
}
