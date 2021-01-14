package com.dev.encryptor;

public interface IEncryption {

	String encrypt(String key, String plainText);

	String decrypt(String key, String cipherText);

}
