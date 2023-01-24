import PivotTableUI from "react-pivottable";
import React, {useState} from 'react';
import './pivottable.css';
import TableRenderers from 'react-pivottable/TableRenderers';
import createPlotlyComponent from 'react-plotly.js/factory';
import createPlotlyRenderers from 'react-pivottable/PlotlyRenderers';

interface Props{
    data: any;
}
function Pivot(props: Props){

    const [tableData, setTableData] = useState(props.data);
    const [state, setState] = useState<any>();

    // create Plotly React component via dependency injection
    const Plot = createPlotlyComponent(window.Plotly);

    // create Plotly renderers via dependency injection
    const PlotlyRenderers = createPlotlyRenderers(Plot);


    return(
        <div className="Pivot">
            <PivotTableUI
                onChange={newData => setState(newData)}
                data={props.data}
                renderers={Object.assign({}, TableRenderers, PlotlyRenderers)}

            />
        </div>
    )
}

export default Pivot;