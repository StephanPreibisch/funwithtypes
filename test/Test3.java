package test;

import net.imglib3.type.try3.IntWritable;
import net.imglib3.type.try3.Writable;
import net.imglib3.type.try3.ByteType;
import net.imglib3.type.try3.DoubleType;
import net.imglib3.type.try3.IntType;
import net.imglib3.type.try3.Readable;

/**
 * Test for net.imglib3.type.try3
 * 
 * @author preibischs
 *
 */
public class Test3 
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
