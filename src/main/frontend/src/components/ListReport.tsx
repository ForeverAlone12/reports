import React, {useEffect, useState} from 'react';
import Pivot from "./Pivot";
import {getJSON} from "../RestAPI";

interface Props{

}
function ListReport(props: Props){

    const VENEREOLOG_API_URL = "/venereological";

    const [result, setResult] = useState();

    const getVenereologResultJSON = () => {
        getJSON(VENEREOLOG_API_URL)
            .then(result => setResult(result));
    }

    useEffect(()=>{
        getVenereologResultJSON();
    }, [])

    return(
        <div className="ListReport">
            <h1> Отчёт венеролога</h1>
            <Pivot data={result}/>
        </div>
    )
}

export default ListReport;