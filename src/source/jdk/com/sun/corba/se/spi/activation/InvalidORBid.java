package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/InvalidORBid.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x86_64/jdk8u291/1294/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, April 8, 2021 2:17:40 AM BST
*/

public final class InvalidORBid extends org.omg.CORBA.UserException
{

  public InvalidORBid ()
  {
    super(InvalidORBidHelper.id());
  } // ctor


  public InvalidORBid (String $reason)
  {
    super(InvalidORBidHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidORBid
