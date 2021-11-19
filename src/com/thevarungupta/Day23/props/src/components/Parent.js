import React from 'react';
import Child from './Child';

const Parent = () => {
    return (
        <div>
            <h1>Parent Compnent</h1>
            <Child name="mark" />
        </div>
    )
}
export default Parent;