import { Menu } from 'antd';
import React from 'react';

function MenuItem({ items }) {
    return items?.map((item) => (
        <Menu.Item key={item.id}>
            <a href={item.url} target="_blank" rel="noopenper noreferrer">
                {`${item.url} - ${item.tiitle}`}
            </a>
        </Menu.Item>
    ))
}


export default MenuItem