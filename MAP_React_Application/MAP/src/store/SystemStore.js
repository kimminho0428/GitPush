import React from 'react';
import {observable} from "mobx";

const SystemStore = observable({
    toggle: false,
    alarmCount: 0,
    // alarmContent: [],
    alarmContent: [
        {
            "id" : 1,
            "severity" : "error",
            "title" : "Server error",
            "content" : "A connection to the server was not successful. Please check the server address or check the server status."
        }, {
            "id" : 2,
            "severity" : "info",
            "title" : "Message arrival from transaction [CC00]",
            "content" : "Enter your ID and password again."
        }, {
            "id" : 3,
            "severity" : "info",
            "title" : "Message arrived from user ID [USER02]",
            "content" : "User [USER02] has sent a message to start a new transaction [CC00]. Do you want to run it right away?"
        }, {
            "id" : 4,
            "severity" : "success",
            "title" : "Login Successed",
            "content" : "Login was successful."
        }, {
            "id" : 5,
            "severity" : "error",
            "title" : "Login Error",
            "content" : "Login failed."
        }, {
            "id" : 6,
            "severity" : "success",
            "title" : "Transaction [CC00] done",
            "content" : "The transaction was executed normally."
        }, {
            "id" : 7,
            "severity" : "info",
            "title" : "Message arrived from user ID [USER03]",
            "content" : "User [USER03] has sent a message to start a new transaction [CC01]. Do you want to run it right away?"
        }, {
            "id" : 8,
            "severity" : "info",
            "title" : "Message arrived from user ID [USER03]",
            "content" : "User [USER02] has sent a message to start a new transaction [CC05]. Do you want to run it right away?"
        }, {
            "id" : 9,
            "severity" : "info",
            "title" : "Message arrival from transaction [CADM]",
            "content" : "Error occured in EXEC CICS REWRITE. Please check server log..."
        }, {
            "id" : 10,
            "severity" : "success",
            "title" : "Transaction [CC02] done",
            "content" : "The transaction was executed normally."
        }
    ],

    setAlarmCount(alarmCount) {
        this.alarmCount = alarmCount;
    },

    setAlarmContent(alarmContent) {
        this.alarmContent = alarmContent;
    },

    setToggle(toggle) {
        this.toggle = toggle;
    }
});

export default SystemStore;

