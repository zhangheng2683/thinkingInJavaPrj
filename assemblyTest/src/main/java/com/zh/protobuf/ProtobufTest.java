package com.zh.protobuf;

import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.InvalidProtocolBufferException;
//import com.zh.model.*;
import io.protostuff.LinkedBuffer;
import io.protostuff.ProtobufIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.junit.Test;

import java.io.*;

/**
 * 需要protobuf插件编译生成相关类
 */
public class ProtobufTest {

//    @Test
//    public void test() throws InvalidProtocolBufferException, UnsupportedEncodingException {
//        PersonModel.Person.Builder builder = PersonModel.Person.newBuilder();
//        builder.setId(1);
//        builder.setName("zh2683");
//        builder.setEmail("zh2683@163.com");
//
//        PersonModel.Person person = builder.build();
//        System.out.println("before:" + person);
//
//        System.out.println("===Person byte length:" + person.toByteArray().length);
//        for (byte b : person.toByteArray()) {
//            System.out.print(b + "-");
//        }
//        System.out.println();
//
//        System.out.println("============" + person.getDescriptorForType().getFullName());
//        byte[] byteArray = person.toByteArray();
//        PersonModel.Person p2 = PersonModel.Person.parseFrom(byteArray);
//
//        PersonJson personJson = new PersonJson();
//        personJson.setId(1);
//        personJson.setName("zh2683");
//        personJson.setEmail("zh2683@163.com");
//        byte[] bytes = JSONObject.toJSONString(personJson).getBytes("utf-8");
//        System.out.println("===PersonJson byte length:" + bytes.length);
//        for (byte b : bytes) {
//            System.out.print(b + "-");
//        }
//    }
//
//    @Test
//    public void test1() {
//        UserDTO user = UserDTO.newBuilder()
//                .setId("10")
//                .setNickName("20")
//                .setEmail("30")
//                .build();
//        System.out.println(user.toByteArray().length);
//    }
//
//    private static int counter = 1000000;
//
//    @Test
//    public void test2() {
//
//        PersonModel.Person.Builder builder = PersonModel.Person.newBuilder();
//        builder.setId(1);
//        builder.setName("zh2683");
//        builder.setEmail("zh2683@163.com");
//
//        DataWrapper wrapper = DataWrapper.newBuilder()
//                .setType(DataWrapper.DataType.login_request)
//                .setLoginRequestDTO(LoginRequestDTO.newBuilder()
//                        .setCode("10010")
//                        .setPassword("20").build())
//                .build();
//
//        long start = System.currentTimeMillis();
//        for (int i = 0 ; i < counter ; i++) {
//            Schema<DataWrapper> schema = RuntimeSchema.getSchema(DataWrapper.class);
//            byte[] data = ProtobufIOUtil.toByteArray(wrapper, schema, LinkedBuffer.allocate());
//            DataWrapper wrapper1 = DataWrapper.newBuilder().build();
//            ProtobufIOUtil.mergeFrom(data, wrapper1, schema);
////            System.out.println(wrapper1.toString());
//        }
//        System.out.println(System.currentTimeMillis() - start);
//    }
//
//    @Test
//    public void test3() {
//        LoginRequestDTO1 loginRequestDTO1 = new LoginRequestDTO1();
//        loginRequestDTO1.setCode("10010");
//        loginRequestDTO1.setPassword("20");
//
//        long start = System.currentTimeMillis();
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        for (int i = 0 ; i < counter ; i++) {
//            byteArrayOutputStream.reset();
//            try {
//                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
//                objectOutputStream.writeObject(loginRequestDTO1);
//                objectOutputStream.close();
//                ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
//                objectInputStream.readObject();
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println(System.currentTimeMillis() - start);
//    }
//
//    public static class LoginRequestDTO1 implements Serializable {
//        private String code;
//
//        private String password;
//
//        public String getCode() {
//            return code;
//        }
//
//        public void setCode(String code) {
//            this.code = code;
//        }
//
//        public String getPassword() {
//            return password;
//        }
//
//        public void setPassword(String password) {
//            this.password = password;
//        }
//    }

}
