import {postRequest} from "../utils/Ajax";

export const login = (data, callback, errback) => {
    const url = "http://localhost:8080/log/login";
    postRequest(url, data, callback, errback);
}

export const saveMsg = (data, callback, errback) => {
    const url = "http://localhost:8080/message/add";
    postRequest(url, data, callback, errback);
}

export const getEvents = (data, callback, errback) => {
    const url = "http://localhost:8080/event/get";
    postRequest(url, data, callback, errback);
}

export const getMsgs = (data, callback, errback) => {
    const url = "http://localhost:8080/message/get";
    postRequest(url, data, callback, errback);
}