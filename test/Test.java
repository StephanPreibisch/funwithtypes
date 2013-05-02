package test;

import net.imglib3.type.try2.ByteRead;
import net.imglib3.type.try2.ByteSet;
import net.imglib3.type.try2.ByteType;
import net.imglib3.type.try2.IntRead;
import net.imglib3.type.try2.IntSet;
import net.imglib3.type.try2.IntType;


public class Test 
{
	public static void main( String[] args )
	{
		//test( new IntType(), new IntType() );
		//new IntType().set( new ByteType() );

		ByteType b = new ByteType();
		IntType i = new IntType();
		
		i.set( i );
		i.set( b );
		
		/*
		IntSet i = null;
		ByteSet b = null;
		
		IntRead< ? > ir = null;
		ByteRead< ? > br = null;
		
		b.set( br );
		i.set( ir );
		i.set( br ); */
	}
	
	
}
