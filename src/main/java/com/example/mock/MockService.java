package com.example.mock;

import org.json.HTTP;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/engine-rest")
public class MockService {

    HashMap<String,String> processMap=new HashMap<>();
    HashMap<String,String> taskMap=new HashMap<>();
    HashMap<String,String> variableMap=new HashMap<>();

    private static final Logger LOGGER= LoggerFactory.getLogger(MockService.class);

    public MockService(){
        processMap.put("pre-configure-port-migration","[\n" +
                "    {\n" +
                "        \"id\": \"bddb38f7-27b3-11e8-838e-5254004e9492\",\n" +
                "        \"businessKey\": \"KT-JUNIPER-14MAR\",\n" +
                "        \"processDefinitionId\": \"pre-configure-port-migration:101:5112685d-2404-11e8-84ae-5254004e9492\",\n" +
                "        \"processDefinitionKey\": \"pre-configure-port-migration\",\n" +
                "        \"processDefinitionName\": \"pre-configure-port-migration\",\n" +
                "        \"startTime\": \"2018-03-14T12:15:57\",\n" +
                "        \"endTime\": null,\n" +
                "        \"state\": \"COMPLETED\"\n" +
                "    }\n" +
                "]");

        processMap.put("migration-scheduling","[\n" +
                "    {\n" +
                "        \"id\": \"bddb38f7-27b3-11e8-838e-5254004e9492\",\n" +
                "        \"businessKey\": \"KT-JUNIPER-14MAR\",\n" +
                "        \"processDefinitionId\": \"migration-scheduling:101:5112685d-2404-11e8-84ae-5254004e9492\",\n" +
                "        \"processDefinitionKey\": \"migration-scheduling\",\n" +
                "        \"processDefinitionName\": \"migration-scheduling\",\n" +
                "        \"startTime\": \"2018-03-14T12:15:57\",\n" +
                "        \"endTime\": null,\n" +
                "        \"state\": \"COMPLETED\"\n" +
                "    }\n" +
                "]");

        processMap.put("port-migration","[\n" +
                "    {\n" +
                "        \"id\": \"bddb38f7-27b3-11e8-838e-5254004e9492\",\n" +
                "        \"businessKey\": \"KT-JUNIPER-14MAR\",\n" +
                "        \"processDefinitionId\": \"migration-scheduling:101:5112685d-2404-11e8-84ae-5254004e9492\",\n" +
                "        \"processDefinitionKey\": \"migration-scheduling\",\n" +
                "        \"processDefinitionName\": \"migration-scheduling\",\n" +
                "        \"startTime\": \"2018-03-14T12:15:57\",\n" +
                "        \"endTime\": null,\n" +
                "        \"state\": \"COMPLETED\"\n" +
                "    }\n" +
                "]");

        processMap.put("1","[\n" +
                "    {\n" +
                "        \"id\": \"bddb38f7-27b3-11e8-838e-5254004e9492\",\n" +
                "        \"businessKey\": \"KT-JUNIPER-14MAR\",\n" +
                "        \"processDefinitionId\": \"migration-scheduling:101:5112685d-2404-11e8-84ae-5254004e9492\",\n" +
                "        \"processDefinitionKey\": \"migration-scheduling\",\n" +
                "        \"processDefinitionName\": \"migration-scheduling\",\n" +
                "        \"startTime\": \"2018-03-14T12:15:57\",\n" +
                "        \"endTime\": null,\n" +
                "        \"state\": \"COMPLETED\"\n" +
                "    }\n" +
                "]");

        taskMap.put("migration-scheduling-confirm-email-user-task","[\n" +
                "    {\n" +
                "        \"id\": \"898d9a40-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"processDefinitionKey\": \"migration-scheduling\",\n" +
                "        \"processDefinitionId\": \"migration-scheduling:5:95b5605f-2004-11e8-a2cc-2477034f81d1\",\n" +
                "        \"processInstanceId\": \"782d832b-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"startTime\": \"2018-03-11T21:10:30\",\n" +
                "        \"endTime\": null,\n" +
                "        \"duration\": 32476,\n" +
                "        \"taskDefinitionKey\": \"migration-scheduling-confirm-email-user-task\",\n" +
                "    }\n" +
                "]");

        taskMap.put("1","[\n" +
                "    {\n" +
                "        \"id\": \"898d9a40-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"processDefinitionKey\": \"migration-scheduling\",\n" +
                "        \"processDefinitionId\": \"migration-scheduling:5:95b5605f-2004-11e8-a2cc-2477034f81d1\",\n" +
                "        \"processInstanceId\": \"782d832b-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"startTime\": \"2018-03-11T21:10:30\",\n" +
                "        \"endTime\": null,\n" +
                "        \"duration\": 32476,\n" +
                "        \"taskDefinitionKey\": \"migration-scheduling-confirm-email-user-task\",\n" +
                "    }\n" +
                "]");

        taskMap.put("base-migration-call-port-migration-activity","[\n" +
                "    {\n" +
                "        \"id\": \"898d9a40-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"processDefinitionKey\": \"migration-scheduling\",\n" +
                "        \"processDefinitionId\": \"migration-scheduling:5:95b5605f-2004-11e8-a2cc-2477034f81d1\",\n" +
                "        \"processInstanceId\": \"782d832b-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"startTime\": \"2018-03-11T21:10:30\",\n" +
                "        \"endTime\": null," +
                "        \"duration\": 32476,\n" +
                "        \"taskDefinitionKey\": \"base-migration-call-port-migration-activity\",\n" +
                "    }\n" +
                "]");

        variableMap.put("changeRequests","[\n" +
                "    {\n" +
                "        \"type\": \"String\",\n" +
                "        \"value\": \"[{\\\"changeRequest\\\":{\\\"changeID\\\":\\\"C17340\\\",\\\"plannedStart\\\":\\\"2018-03-12T02:00:00.000Z\\\",\\\"plannedFinish\\\":\\\"2018-03-31T10:30:00.000Z\\\"}}]\",\n" +
                "        \"valueInfo\": {},\n" +
                "        \"id\": \"782f09ce-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"name\": \"changeRequests\",\n" +
                "    }\n" +
                "]");
        variableMap.put("portMigrationSucceeded","[\n" +
                "    {\n" +
                "        \"type\": \"Boolean\",\n" +
                "        \"value\": true,\n" +
                "        \"valueInfo\": {},\n" +
                "        \"id\": \"782f09ce-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"name\": \"portMigrationSucceeded\",\n" +
                "    }\n" +
                "]");
        variableMap.put("uid","[\n" +
                "    {\n" +
                "        \"type\": \"String\",\n" +
                "        \"value\": \"514\",\n" +
                "        \"valueInfo\": {},\n" +
                "        \"id\": \"782f09ce-259a-11e8-8cfc-2477034f81d1\",\n" +
                "        \"name\": \"uid\",\n" +
                "    }\n" +
                "]");
    }

    @RequestMapping("/history/process-instance")
    public @ResponseBody String processInstance(@RequestBody String req){
        LOGGER.info("Request for process history {}",req);
        JSONObject jsonObject=getJsonReq(req);
        String processId=jsonObject.get("processInstanceId").toString();

        String processName=processId.substring(processId.indexOf("@")+1);
        JSONArray resp=getJsonArray(processMap.get("1"));
        ((JSONObject)resp.get(0)).put("id",processId);
        ((JSONObject)resp.get(0)).put("processDefinitionKey",processName);


        return resp.toString();
    }


    @RequestMapping("/history/task")
    public @ResponseBody String taskHistory(@RequestBody String req){

        LOGGER.info("Request for task history {}",req);
        JSONObject jsonObject=getJsonReq(req);
        String processId=jsonObject.get("processInstanceId").toString();
        String taskDefinitionKey=jsonObject.get("taskDefinitionKey").toString();
        //String processName=processId.substring(0,processId.indexOf("@"));

        JSONArray resp=getJsonArray(taskMap.get("1"));
        ((JSONObject)resp.get(0)).put("id",processId);
        ((JSONObject)resp.get(0)).put("taskDefinitionKey",taskDefinitionKey);


        return resp.toString();
    }

    @RequestMapping("/task/{taskId}")
    public @ResponseBody String taskInstance(@PathVariable("taskId") String taskId){

        LOGGER.info("Request for task instance {}",taskId);
        //JSONObject jsonObject=getJsonReq(req);

        JSONArray resp=getJsonArray(taskMap.get("1"));
        ((JSONObject)resp.get(0)).put("id",taskId);
        //((JSONObject)resp.get(0)).put("processDefinitionKey",processName);


        return resp.get(0).toString();
    }

    @RequestMapping("/history/variable-instance")
    public @ResponseBody String variableInstance(@RequestBody String req){
        //String portMetaDataRequest = "{\"processInstanceId\":\""+processId+"\",\"variableName\": \"changeRequests\"}";
        LOGGER.info("Request for variable instance {}",req);
        JSONObject jsonObject=getJsonReq(req);
        String processId=jsonObject.get("processInstanceId").toString();
        String variableName=jsonObject.get("variableName").toString();
        //String processName=processId.substring(0,processId.indexOf("@"));

        JSONArray resp=getJsonArray(variableMap.get(variableName));
        ((JSONObject)resp.get(0)).put("id",processId);

        return resp.toString();
    }


    public JSONObject getJsonReq(String req){

        JSONParser jsonParser=new JSONParser();
        JSONObject jsonObject=new JSONObject();

        try {
            jsonObject=(JSONObject) jsonParser.parse(req);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return jsonObject;
    }

    public JSONArray getJsonArray(String req){

        JSONParser jsonParser=new JSONParser();
        JSONArray jsonArray=new JSONArray();

        try {
            jsonArray=(JSONArray) jsonParser.parse(req);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return jsonArray;
    }


    @RequestMapping("/task/{taskId}/submit-form")
    public @ResponseBody Object submitTask(@PathVariable("taskId") String taskId, @RequestBody String req,
                                      HttpServletResponse response){

        LOGGER.info("Request for submit task {} {}",taskId,req);
        JSONObject jsonObject=getJsonReq(req);
        //response.setStatus(HttpStatus.SC_NO_CONTENT);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        //return "{'result':'success'}";
    }

    @RequestMapping("/process-definition/key/{processKey}/submit-form")
    public @ResponseBody Object startProcess(@PathVariable("processKey") String processKey, @RequestBody String req,
                                      HttpServletResponse response){

        LOGGER.info("Request for start process {} {}",processKey,req);
        JSONObject jsonObject=getJsonReq(req);
        return "{\"id\":\""+ "1234"+"@"+ processKey+"\"}";
    }

}
