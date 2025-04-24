package com.infrastructuretool.faultreporting.exception;

public class AttachmentNotFoundException extends RuntimeException{

    public AttachmentNotFoundException (Long id){
        super ("Couldn't find am Attachment with id "+id);
    }
}
