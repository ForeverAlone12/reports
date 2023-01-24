// Кроневой URL REST API. По умолчанию пустой,
// потому что REST API располагается на том же хосте,
// с которого загружается клиентское приложение
const ROOT_URL = "";

export const getJSON = (url: string) =>
    fetch(ROOT_URL+url)
        .then(response => response.json());

export const putJSON = (url: string, id: any, data: any) =>
    fetch((ROOT_URL + url + "/" + id),{
        method: 'PUT',
        headers: {
            "Content-Type": "application/json"
        },
        body:JSON.stringify(data)
    })
        .then(response=>response.text());