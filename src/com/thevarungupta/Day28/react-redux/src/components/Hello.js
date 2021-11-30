import { useSelector } from 'react-redux';
const Hello = ( )=> {

    const counter = useSelector(state=> state.counter)

    return(
        <h1>{ counter} </h1>
    )
}
export default Hello;