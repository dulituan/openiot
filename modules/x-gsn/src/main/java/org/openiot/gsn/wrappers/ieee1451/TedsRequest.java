/**
*    Copyright (c) 2011-2014, OpenIoT
*   
*    This file is part of OpenIoT.
*
*    OpenIoT is free software: you can redistribute it and/or modify
*    it under the terms of the GNU Lesser General Public License as published by
*    the Free Software Foundation, version 3 of the License.
*
*    OpenIoT is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU Lesser General Public License for more details.
*
*    You should have received a copy of the GNU Lesser General Public License
*    along with OpenIoT.  If not, see <http://www.gnu.org/licenses/>.
*
*     Contact: OpenIoT mailto: info@openiot.eu
 * @author Ali Salehi
*/

package org.openiot.gsn.wrappers.ieee1451;

/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE. This
 * class implements a Java interface to the 'TedsRequest' message type.
 */

public class TedsRequest extends net.tinyos1x.message.Message {
   
   /** The default size of this message type in bytes. */
   public static final int DEFAULT_MESSAGE_SIZE = 1;
   
   /** The Active Message type associated with this message. */
   public static final int AM_TYPE              = 27;
   
   /** Create a new TedsRequest of size 1. */
   public TedsRequest ( ) {
      super( DEFAULT_MESSAGE_SIZE );
      amTypeSet( AM_TYPE );
   }
   
   /** Create a new TedsRequest of the given data_length. */
   public TedsRequest ( int data_length ) {
      super( data_length );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * Create a new TedsRequest with the given data_length and base offset.
    */
   public TedsRequest ( int data_length , int base_offset ) {
      super( data_length , base_offset );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * Create a new TedsRequest using the given byte array as backing store.
    */
   public TedsRequest ( byte [ ] data ) {
      super( data );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * Create a new TedsRequest using the given byte array as backing store, with
    * the given base offset.
    */
   public TedsRequest ( byte [ ] data , int base_offset ) {
      super( data , base_offset );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * Create a new TedsRequest using the given byte array as backing store, with
    * the given base offset and data length.
    */
   public TedsRequest ( byte [ ] data , int base_offset , int data_length ) {
      super( data , base_offset , data_length );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * Create a new TedsRequest embedded in the given message at the given base
    * offset.
    */
   public TedsRequest ( net.tinyos1x.message.Message msg , int base_offset ) {
      super( msg , base_offset , DEFAULT_MESSAGE_SIZE );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * Create a new TedsRequest embedded in the given message at the given base
    * offset and length.
    */
   public TedsRequest ( net.tinyos1x.message.Message msg , int base_offset , int data_length ) {
      super( msg , base_offset , data_length );
      amTypeSet( AM_TYPE );
   }
   
   /**
    * /* Return a String representation of this message. Includes the message
    * type name and the non-indexed field values.
    */
   public String toString ( ) {
      String s = "Message <TedsRequest> \n";
      try {
         s += "  [Teds_Request=0x" + Long.toHexString( get_Teds_Request( ) ) + "]\n";
      } catch ( ArrayIndexOutOfBoundsException aioobe ) { /* Skip field */
      }
      return s;
   }
   
   // Message-type-specific access methods appear below.
   
   // ///////////////////////////////////////////////////////
   // Accessor methods for field: Teds_Request
   // Field type: short, unsigned
   // Offset (bits): 0
   // Size (bits): 8
   // ///////////////////////////////////////////////////////
   
   /**
    * Return whether the field 'Teds_Request' is signed (false).
    */
   public static boolean isSigned_Teds_Request ( ) {
      return false;
   }
   
   /**
    * Return whether the field 'Teds_Request' is an array (false).
    */
   public static boolean isArray_Teds_Request ( ) {
      return false;
   }
   
   /**
    * Return the offset (in bytes) of the field 'Teds_Request'
    */
   public static int offset_Teds_Request ( ) {
      return ( 0 / 8 );
   }
   
   /**
    * Return the offset (in bits) of the field 'Teds_Request'
    */
   public static int offsetBits_Teds_Request ( ) {
      return 0;
   }
   
   /**
    * Return the value (as a short) of the field 'Teds_Request'
    */
   public short get_Teds_Request ( ) {
      return ( short ) getUIntElement( offsetBits_Teds_Request( ) , 8 );
   }
   
   /**
    * Set the value of the field 'Teds_Request'
    */
   public void set_Teds_Request ( short value ) {
      setUIntElement( offsetBits_Teds_Request( ) , 8 , value );
   }
   
   /**
    * Return the size, in bytes, of the field 'Teds_Request'
    */
   public static int size_Teds_Request ( ) {
      return ( 8 / 8 );
   }
   
   /**
    * Return the size, in bits, of the field 'Teds_Request'
    */
   public static int sizeBits_Teds_Request ( ) {
      return 8;
   }
   
}
