const Child  = (props) => {
    return(
        <div>
            <h1>Child Component</h1>
            <h2>{ props.data }</h2>
            <button onClick={props.handler}>Change</button>
        </div>
    )
}
export default Child;